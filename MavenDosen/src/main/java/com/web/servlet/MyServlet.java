package com.web.servlet;

import java.io.IOException;
import java.util.Arrays;
import java.util.List;

import com.web.dao.DosenDao;
import com.web.model.Dosen;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@WebServlet("/")
public class MyServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	
	DosenDao dao = new DosenDao();

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// TODO Auto-generated method stub
		super.doGet(req, resp);
	}

	protected void doGet(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
		
		String action = req.getServletPath();
		
		switch(action) {
		case "/new":
			formBaru(req, res);
			break;
		case "/insert":
			insertDosen(req, res);
			break;
		case "/edit":
			formEdit(req, res);
			break;
		case "/update":
			updateDosen(req, res);
			break;
		case "/delete":
			deleteDosen(req, res);
		default:
			listDosen(req, res);
			break;
		
		}
		
	}
	
	public void formBaru(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
		RequestDispatcher rd = req.getRequestDispatcher("add.jsp");
		rd.forward(req, res);
	}
	public void insertDosen(HttpServletRequest req, HttpServletResponse res) throws IOException
	{
		String kode_dosen = req.getParameter("kode_dosen");
		String nama = req.getParameter("nama");
		Dosen newDosen = new Dosen(kode_dosen,nama);
		
		dao.inserDosen(newDosen);
		res.sendRedirect("list");
	}
	
	public void formEdit(HttpServletRequest req, HttpServletResponse res) {
		String kode_dosen=req.getParameter("kode_dosen");
		Dosen exDosen;
		try {
			exDosen = dao.selectDosen(kode_dosen);
			RequestDispatcher rd = req.getRequestDispatcher("edit.jsp");
			req.setAttribute("dosen", exDosen);
			rd.forward(req, res);
		} catch (Exception e) {
			e.printStackTrace();
		}
		
	}
	
	
	
	public void updateDosen(HttpServletRequest req, HttpServletResponse res) throws IOException {
		String kode_dosen = req.getParameter("kode_dosen");
		String nama = req.getParameter("nama");
		Dosen dosen = new Dosen(kode_dosen,nama);
		
		dao.updateDosen(dosen);
		res.sendRedirect("list");
	}
	
	public void deleteDosen(HttpServletRequest req, HttpServletResponse res) throws IOException {
		String kode_dosen = req.getParameter("kode_dosen");
		dao.deletDosen(kode_dosen);
		res.sendRedirect("list");
	}
	
	
	public void listDosen(HttpServletRequest req, HttpServletResponse res) {
		try {
			DosenDao dao = new DosenDao();
			List<Dosen> listDosen = dao.getAllDosen();
			req.setAttribute("listDosen", listDosen);
			RequestDispatcher rd = req.getRequestDispatcher("show.jsp");
			rd.forward(req, res);
		} catch (Exception e) {
			e.printStackTrace();
		}
		
	}


	
	
	

}
