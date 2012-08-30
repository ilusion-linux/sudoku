package sudoku;

import java.io.*;
import javax.swing.JOptionPane;

public class Cargar
{
    public int dificultad;
    public String idioma;
    public String tema;
    public String aleatoriedad;
    public String [] traduccion;
    private FileReader fr;
    private BufferedReader br;
    private FileWriter fw;
    private BufferedWriter bw;
    private PrintWriter pw;
    private String direccion;
    private final int limite=43;

    public Cargar()
    {
        direccion=System.getProperty("user.home")+"/.config_sudoku_ilusion/"+
            "config.sudoku";
    }

    public void cargarConfiguracion()
    {
        try
        {
            fr=new FileReader(direccion);
            br=new BufferedReader(fr);
            dificultad=Integer.parseInt(br.readLine());
            aleatoriedad=br.readLine();
            idioma=br.readLine();
            tema=br.readLine();
            br.close();
            fr.close();
        }
        catch(Exception e)
        {
            JOptionPane.showMessageDialog(null, e.getMessage(), "!ERROR¡",
            JOptionPane.OK_OPTION);
        }
    }
    public void cargarTraduccion()
    {
        try
        {
            direccion=System.getProperty("user.home")+"/.config_sudoku_ilusion"+
                "/idioma"+idioma+".sudoku";
            fr=new FileReader(direccion);
            br=new BufferedReader(fr);
            traduccion=new String[limite];
            for(int x=0; x<limite; x++)
            {
                traduccion[x]=br.readLine();
            }
            br.close();
            fr.close();
        }
        catch(Exception e)
        {
            JOptionPane.showMessageDialog(null, e.getMessage(), "!ERROR¡",
            JOptionPane.OK_OPTION);
        }
    }
    public void modificarNivel(int dificultad, String aleatoriedad)
    {
        try
        {
            direccion=System.getProperty("user.home")+"/.config_sudoku_ilusion"+
                "/config.sudoku";
            fw = new FileWriter(direccion);
            bw=new BufferedWriter(fw);
            pw=new PrintWriter(bw);
            this.dificultad=dificultad;
            this.aleatoriedad=aleatoriedad;
            Sudoku.cambiandoDificultad(dificultad);
            Sudoku.cambiandoAleatoriedad(aleatoriedad);
            pw.println(dificultad);
            pw.println(aleatoriedad);
            pw.println(idioma);
            pw.print(tema);
            pw.close();
            bw.close();
            fw.close();
        }
        catch(Exception e)
        {
            JOptionPane.showMessageDialog(null, e.getMessage(), "!ERROR¡",
            JOptionPane.OK_OPTION);
        }
    }
    public void modificarConfiguracion(String tema, String idioma)
    {
        try
        {
            direccion=System.getProperty("user.home")+"/.config_sudoku_ilusion"+
                "/config.sudoku";
            fw = new FileWriter(direccion);
            bw=new BufferedWriter(fw);
            pw=new PrintWriter(bw);
            this.tema=tema;
            this.idioma=idioma;
            pw.println(dificultad);
            pw.println(aleatoriedad);
            pw.println(idioma);
            pw.print(tema);
            pw.close();
            bw.close();
            fw.close();
        }
        catch(Exception e)
        {
            JOptionPane.showMessageDialog(null, e.getMessage(), "!ERROR¡",
            JOptionPane.OK_OPTION);
        }
    }
}