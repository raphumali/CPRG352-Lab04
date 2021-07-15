
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

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        Note note;
        String edit = request.getParameter("edit");
        String path = getServletContext().getRealPath("/WEB-INF/note.txt");
        
        String noteTitle = null;
        String noteContents = null;
        
        
        try ( //Reading the file
                BufferedReader br = new BufferedReader(new FileReader(new File (path)))) {
            //Reads both the lines form the file
            noteTitle = br.readLine();
            noteContents = br.readLine();
            br.close();
        }catch(Exception e){
            System.out.println(e);
        }
 
       
        //used to display the text file to jsp
        note = new Note(noteTitle, noteContents);
        request.setAttribute("note", note);
  
        //Display page and go to editnote when edit is clicked
        if(edit == null){ 
        getServletContext().getRequestDispatcher("/WEB-INF/viewnote.jsp").forward(request, response);
        } else {
        getServletContext().getRequestDispatcher("/WEB-INF/editnote.jsp").forward(request, response);
        }
    }

  
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        Note note;
        //Attributes
        String editTitle = request.getParameter("title");
        String editContents = request.getParameter("contents");
        String path = getServletContext().getRealPath("/WEB-INF/note.txt");
        
        //Writing new title and contents
        try (PrintWriter pw = new PrintWriter(new BufferedWriter(new FileWriter(path, false)))) {
            //Writing new title and contents
            pw.println(editTitle);
            pw.println(editContents);
            pw.close();
        }catch(Exception e){
            System.out.println(e);
        }
        
        //new title and contents if user has edited the note
        note = new Note(editTitle, editContents);
        request.setAttribute("note", note);
        
        //goes back to viewnote with saved changes
        getServletContext().getRequestDispatcher("/WEB-INF/viewnote.jsp").forward(request, response);
        
    }


}
