package mif04.gdw.tp1.itf;

import mif04.gdw.tp1.metier.Blog;
import mif04.gdw.tp1.modele.Billet;
import mif04.gdw.tp1.modele.User;

import javax.persistence.EntityManager;
import javax.persistence.Persistence;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

/**
 * Created by ecoquery on 25/09/2016.
 */
public class BlogServlet extends HttpServlet {

    private EntityManager em;
    private Blog blog;


    @Override
    public void destroy() {
        super.destroy();
        // TODO: placer le code permettant de libérer proprement les ressources utilisées par la servlet
        em.close();
    }

    @Override
    public void init() throws ServletException {
        super.init();
        // TODO: initialiser les ressources utilisées par la servlet
        em = Persistence.createEntityManagerFactory("pu-microblog").createEntityManager();
        blog = new Blog(em);
    }

    @Override
    protected void doGet(HttpServletRequest request,
                         HttpServletResponse response) throws ServletException,
            IOException {
        String titre = "PAS DE TITRE";
        User currentUser = null;
        Billet billet = null;
        view(response, titre, currentUser, billet);
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        super.doPost(req, resp);
    }

    protected void view(HttpServletResponse response, String titre, User currentUser, Billet billet) throws IOException {
        response.setContentType("text/html");
        response.setStatus(HttpServletResponse.SC_OK);
        PrintWriter output = response.getWriter();
        output.println("<html><head><title>" + titre + "</head><body>");
        output.println("<div class='login' style='float:right;'>");
        viewLogin(output, currentUser);
        output.println("</div>");
        output.println("<div class='categories' style='float:right'>");
        viewCategorieList(output);
        output.println("</div>");
        output.println("<div class='main'><h1>" + titre + "</h1>");
        viewBody(output, currentUser, billet);
        output.println("</div>");
        output.println("</body></html>");
    }

    private void viewLogin(PrintWriter output, User currentUser) {
        // FIXME: Gérer le login
        output.println("Login view here");
    }

    private void viewBody(PrintWriter output, User currentUser, Billet billet) {
        // FIXME: afficher le texte
        output.println("body view here");
    }

    private void viewCategorieList(PrintWriter output) {
        // FIXME: Lister les catégories
        output.println("categories view here");
    }
}
