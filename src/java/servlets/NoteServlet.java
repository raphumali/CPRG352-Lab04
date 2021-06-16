
package servlets;

import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;
import models.Note;


/**
 *
 * @author 786097
 */
public class NoteServlet extends HttpServlet {

    Note note;

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
          getServletContext().getRequestDispatcher("/WEB-INF/viewnote.jsp").forward(request, response);
      
    }

  
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
     

        
    }


}
