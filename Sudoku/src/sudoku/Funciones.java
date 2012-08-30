package sudoku;

import javax.swing.JTextField;

public class Funciones
{
    private JTextField [][] txtTablaHeredada;
    private int pvCuadrante;
    private int phCuadrante;
    private final int limite=9;

    public Funciones(JTextField [][] txtTabla)
    {
        txtTablaHeredada=txtTabla;
        pvCuadrante=0;
        phCuadrante=0;
    }

    private int obtenerCuadrante(int x, int y)
    {
        int retorno=0;
        if(x<=2)
        {
            if(y<=2)
            {
                retorno=1;
            }
            else if(y<=5)
            {
                retorno=2;
            }
            else
            {
                retorno=3;
            }
        }
        else if(x<=5)
        {
            if(y<=2)
            {
                retorno=4;
            }
            else if(y<=5)
            {
                retorno=5;
            }
            else
            {
                retorno=6;
            }
        }
        else
        {
            if(y<=2)
            {
                retorno=7;
            }
            else if(y<=5)
            {
                retorno=8;
            }
            else
            {
                retorno=9;
            }
        }
        return retorno;
    }
    private void obtenerLimites(int c)
    {
        switch(c)
        {
            case 1:
                pvCuadrante=0;
                phCuadrante=0;
                break;
            case 2:
                pvCuadrante=0;
                phCuadrante=3;
                break;
            case 3:
                pvCuadrante=0;
                phCuadrante=6;
                break;
            case 4:
                pvCuadrante=3;
                phCuadrante=0;
                break;
            case 5:
                pvCuadrante=3;
                phCuadrante=3;
                break;
            case 6:
                pvCuadrante=3;
                phCuadrante=6;
                break;
            case 7:
                pvCuadrante=6;
                phCuadrante=0;
                break;
            case 8:
                pvCuadrante=6;
                phCuadrante=3;
                break;
            case 9:
                pvCuadrante=6;
                phCuadrante=6;
                break;
        }
    }
    public boolean ingresoCorrecto(int a, int b, String v)
    {
        obtenerLimites(obtenerCuadrante(a, b));
        int valor=Integer.parseInt(v);
        for(int x=pvCuadrante; x<=(pvCuadrante+2); x++)
        {
            for(int y=phCuadrante; y<=(phCuadrante+2); y++)
            {
                if(txtTablaHeredada[x][y].getText().isEmpty()==false)
                {
                    int temp=Integer.parseInt(txtTablaHeredada[x][y].getText());
                    if(temp==valor)
                    {
                        return false;
                    }
                }
            }
        }
        for(int x=0; x<limite; x++)
        {
            int temp=0;
            if(txtTablaHeredada[a][x].getText().isEmpty()==false)
            {
                temp=Integer.parseInt(txtTablaHeredada[a][x].getText());
                if(temp==valor)
                {
                    return false;
                }
            }
            if(txtTablaHeredada[x][b].getText().isEmpty()==false)
            {
                temp=Integer.parseInt(txtTablaHeredada[x][b].getText());
                if(temp==valor)
                {
                    return false;
                }
            }
        }
        return true;
    }
    public boolean esDigito(int num)
    {
        boolean retorno;
        switch(num)
        {
            case '1': case '2': case '3': case '4': case '5':
            case '6': case '7': case '8': case '9':
                retorno=true;
                break;
            default:
                retorno=false;
                break;
        }
        return retorno;
    }
}
