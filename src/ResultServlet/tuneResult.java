package ResultServlet;

import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import javax.persistence.EntityManager;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import models.SongtitleDTO;
import utils.DBUtil;

/**
 * Servlet implementation class result
 */
@WebServlet("/tuneResult")
public class tuneResult extends HttpServlet {
    private static final long serialVersionUID = 1L;

    /**
     * @see HttpServlet#HttpServlet()
     */
    public tuneResult() {
        super();
        // TODO Auto-generated constructor stub
    }

    /**
     * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
     */
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        EntityManager em = DBUtil.createEntityManager();

        String ts =  request.getParameter("tuneSerch");
        List<SongtitleDTO> song = new ArrayList<SongtitleDTO>();
        Statement stmt = null;
        ResultSet rs = null;
        Connection conn = null;

        try{
            conn = DriverManager.getConnection("jdbc:mysql://localhost/music_db?useSSL=false",
                    "yk",
                    "pass");

            stmt = conn.createStatement();

            if(ts.equals("元気ソング")){
                String sql = "SELECT * FROM tblsongtitle WHERE tune_num = 1";
                rs = stmt.executeQuery(sql);

            } else if(ts.equals("楽しい")) {
                String sql = "SELECT * FROM tblsongtitle WHERE tune_num = 2";
                rs = stmt.executeQuery(sql);
            } else if(ts.equals("悲しい")) {
                String sql = "SELECT * FROM tblsongtitle WHERE tune_num = 3";
                rs = stmt.executeQuery(sql);
            } else if(ts.equals("リラックス")) {
                String sql = "SELECT * FROM tblsongtitle WHERE tune_num = 4";
                rs = stmt.executeQuery(sql);
            } else if(ts.equals("ロマンティック")) {
                String sql = "SELECT * FROM tblsongtitle WHERE tune_num = 5";
                rs = stmt.executeQuery(sql);
            }


            while(rs.next()){
                SongtitleDTO songdata = new SongtitleDTO();
                songdata.setSong_id(rs.getInt("song_id"));
                songdata.setSong_title(rs.getString("song_title"));
                songdata.setComment(rs.getString("comment"));
                songdata.setArtist_num(rs.getInt("artist_num"));
                songdata.setTune_num(rs.getInt("tune_num"));
                songdata.setComposition_ymd(rs.getTimestamp("composition_ymd"));
                songdata.setSeries_num(rs.getInt("series_num"));

                song.add(songdata);

            }


            request.setAttribute("songId", song.get(0).getSong_id());
            request.setAttribute("songTitle", song.get(0).getSong_title());
            request.setAttribute("songComment", song.get(0).getComment());
            request.setAttribute("songArtist", song.get(0).getArtist_num());
            request.setAttribute("songTune", song.get(0).getTune_num());
            request.setAttribute("songCreate", song.get(0).getComposition_ymd());
            request.setAttribute("songSeries", song.get(0).getSeries_num());

            if(song.size() > 1){
                request.setAttribute("songId1", song.get(1).getSong_id());
                request.setAttribute("songTitle1", song.get(1).getSong_title());
                request.setAttribute("songComment1", song.get(1).getComment());
                request.setAttribute("songArtist1", song.get(1).getArtist_num());
                request.setAttribute("songTune1", song.get(1).getTune_num());
                request.setAttribute("songCreate1", song.get(1).getComposition_ymd());
                request.setAttribute("songSeries1", song.get(1).getSeries_num());
            }

            RequestDispatcher rd = request.getRequestDispatcher("/WEB-INF/views/Resultjsp.jsp");
            rd.forward(request, response);

            rs.close();
            stmt.close();

        }catch (SQLException e) {
            // DBとの処理で何らかのエラーがあった場合の例外
            e.printStackTrace();

        } finally {
            // 7. 接続を閉じる
            if (rs != null) {
                try {
                    rs.close();
                } catch (SQLException e) {
                    e.printStackTrace();
                }
            }
            if (stmt != null) {
                try {
                    stmt.close();
                } catch (SQLException e) {
                    e.printStackTrace();
                }
            }
            if (conn != null) {
                try {
                    conn.close();
                } catch (SQLException e) {
                    e.printStackTrace();
                }
            }
        }
        em.close();
    }

    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        doGet(request, response);
    }
}
