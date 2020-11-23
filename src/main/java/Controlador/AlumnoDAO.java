package controlador;




import java.sql.CallableStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

//Data Access Object
public class AlumnoDAO {
    
    
    
    
    
    public void agregarRegistro(String idOrden, String fecha, int cantidad, String tipoPago, String idMesero)throws SQLException{
        
        CallableStatement entrada = Prueba.Conexión.getConexion().prepareCall("(call EntradaArticulo(?,?,?,?,?))");
        entrada.setString(1,idOrden);
        entrada.setString(2,fecha);
        entrada.setInt(3,cantidad); 
        entrada.setString(4,tipoPago);
        entrada.setString(5,idMesero);
        entrada.execute();
        
        
    }
    /*
    //========================Metodos que permiten realizar las operaciones ABCC ============================

    public boolean agregarAlumno(Alumno a){

        //INSERT INTO Alumnos VALUES("1", '1', '1', '1', 1, 1, '1');
        String sql = "INSERT INTO alumnos VALUES('"+a.getNumControl()
                +"','" + a.getNombre()
                +"','" + a.getPrimerAp()
                +"','" + a.getSegundoAp()
                +"', " + a.getEdad()
                +", " + a.getSemestre()
                +", '" + a.getCarrera()+ "')";

        boolean resultado = new ConexionBD().ejecutarInstruccion(sql);
        System.out.println("ALUMNO DAO: " + resultado);

        return resultado;
    }

    public boolean eliminarAlumno(String numControl){

        //DELETE FROM Alumnos WHERE Num_Control = '3';
        String sql = "DELETE FROM Alumnos WHERE Num_Control = '"+numControl+"'";
        return new ConexionBD().ejecutarInstruccion(sql);
    }


    public boolean modificarAlumno(Alumno a){
        //UPDATE Alumnos SET Nombre_Alumno='x', Primer_Ap_Alumno='x', Segundo_Ap_Alumno='x', Edad_Alumno=0, Semestre=0,
        //    Carrera='x' WHERE Num_Control='3';

        String sql = "UPDATE Alumnos SET Nombre_Alumno='"+a.getNombre()
                +"', Primer_Ap_Alumno='" + a.getPrimerAp()
                +"', Segundo_Ap_Alumno='" + a.getSegundoAp()
                +"', Edad_Alumno=" + a.getEdad()
                +", Semestre=" + a.getSemestre()
                +", Carrera='" + a.getCarrera()+ "' WHERE Num_Control='"+a.getNumControl()+"'";

        boolean resultado = new ConexionBD().ejecutarInstruccion(sql);
        System.out.println("ALUMNO DAO: " + resultado);

        return resultado;
    }

    public Alumno buscarAlumno(String numControl){
        //SELECT * FROM Alumnos WHERE Num_Control = '2';
        String sql = "SELECT * FROM Alumnos WHERE Num_Control = '"+numControl+"'";

        ResultSet res = new ConexionBD().ejecutarConsultaRegistros(sql);

        try {
            res.last();

            return new Alumno(res.getString("Num_Control"),
                    res.getString(2),
                    res.getString(3),
                    res.getString(4),
                    res.getByte(5),
                    res.getByte(6),
                    res.getString(7)
                    );

        } catch (SQLException throwables) {
            throwables.printStackTrace();
            return null;
        }
    }

    public ArrayList<Alumno> buscarAlumnos(String filtro){

        return null;
    }

*/
}
