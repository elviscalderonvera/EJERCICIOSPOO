
package cursoonlin;

import cursoonlin.dao.CursoDao;
import cursoonlin.dao.CursoDaoImpl;
import cursoonlin.entidades.curso;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

public class CursoOnlin {
    static String url= "jdbc:postgresql://localhost/cursos_online";
    static String user = "postgres";
    static String password = "1234";
    public static void main(String[] args) {
        CursoDao cursoDao= new CursoDaoImpl();
        curso newCurso = new curso(3, "Modificado Nuevo Curso de Java");
        //cursoDao.ingresar(newCurso);
        //cursoDao.actualizar(newCurso);
        cursoDao.eliminar(5);
        List<curso> cursos= cursoDao.getCursos();
        System.out.println(cursos);
        
        //cursos = cursoDao.getCursos();
        //System.out.println(cursos.size());
        
    }

}
// NOMBRE: ELVIS CALDERON VERA