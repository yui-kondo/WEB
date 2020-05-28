package getList;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


/**
 * Servlet implementation class Getlist01
 */
@WebServlet("/Getlist01")
public class Getlist01 extends HttpServlet {
    private static final long serialVersionUID = 1L;

    /**
     * @see HttpServlet#HttpServlet()
     */
    public Getlist01() {
        super();
        // TODO Auto-generated constructor stub
    }



    /**
     * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
     */
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        String category =request.getParameter("category");


        if(category.equals("song")){
            RequestDispatcher rd = request.getRequestDispatcher("/WEB-INF/listSerch/SongList.jsp");
            rd.forward(request, response);

        } else if(category.equals("artist")){
            RequestDispatcher rd = request.getRequestDispatcher("/WEB-INF/listSerch/ArtistList.jsp");
            rd.forward(request, response);

        } else if(category.equals("series")){
            RequestDispatcher rd = request.getRequestDispatcher("/WEB-INF/listSerch/SeriesList.jsp");
            rd.forward(request, response);

        } else if(category.equals("tune")){
            RequestDispatcher rd = request.getRequestDispatcher("/WEB-INF/listSerch/TuneList.jsp");
            rd.forward(request, response);

        }else if(category.equals("createday")){
            RequestDispatcher rd = request.getRequestDispatcher("/WEB-INF/listSerch/CreatedayList.jsp");
            rd.forward(request, response);

        }

    }

    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        // TODO Auto-generated method stub
        doGet(request, response);
    }


}
