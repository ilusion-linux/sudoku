package sudoku;

public class Sudoku
{
    public int [][] tablaLista;
    private int [][] tabla;
    private int [] elementos;
    private int [] cuadrantes;
    private int phCuadrante;
    private int pvCuadrante;
    private static int dificultad;
    private static String aleatoriedad;
    private final int limite=9;

    public Sudoku(int a, String b)
    {
        dificultad=a;
        aleatoriedad=b;
        tabla=new int[limite][limite];
        tablaLista=new int[limite][limite];
        elementos=new int[limite];
    }

    public void generandoSudoku()
    {
        inicializandoTabla();
        elementosAleatorios();
        cuadrantes=new int[limite];
        if(aleatoriedad.compareTo("simple")==0)
        {
            for(int x=0; x<limite; x++)
            {
                cuadrantes[x]=x+1;
            }
        }
        else
        {
            cuadrantesAleatorios();
        }
        generarSudoku();
        generarTablaLista();
        boolean estado=true;
        for(int x=0; x<limite; x++)
        {
            for(int y=0; y<limite; y++)
            {
                if(tabla[x][y]==0)
                {
                    estado=false;
                    y=limite;
                    x=limite;
                }
            }
        }
        if(estado==false)
        {
            generandoSudoku();
        }
    }
    private void inicializandoTabla()
    {
        for(int x=0; x<limite; x++)
        {
            for(int y=0; y<limite; y++)
            {
                tabla[x][y]=0;
            }
        }
    }
    private void elementosAleatorios()
    {
        int x=0;
        while(x<limite)
        {
            int temp=(int)(Math.random()*100);
            temp=(temp%9)+1;
            for(int y=0; y<x; y++)
            {
                if(elementos[y]==temp)
                {
                    temp=0;
                    y=x+1;
                }
            }
            if(temp!=0)
            {
                elementos[x]=temp;
                ++x;
            }
        }
    }
    private void cuadrantesAleatorios()
    {
        int x=0;
        while(x<limite)
        {
            int temp=(int)(Math.random()*100);
            temp=(temp%9)+1;
            for(int y=0; y<x; y++)
            {
                if(cuadrantes[y]==temp)
                {
                    temp=0;
                    y=x+1;
                }
            }
            if(temp!=0)
            {
                cuadrantes[x]=temp;
                ++x;
            }
        }
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
    private void generarSudoku()
    {
        for(int x=0; x<limite; x++)
        {
            for(int y=0; y<limite; y++)
            {
                agregarElemento(cuadrantes[y], elementos[x]);
            }
            if(aleatoriedad.compareTo("avanzada")==0)
            {
                cuadrantesAleatorios();
            }
        }
    }
    private void agregarElemento(int cuadrante, int valor)
    {
        obtenerLimites(cuadrante);
        boolean libre=true;
        for(int x=pvCuadrante; x<=(pvCuadrante+2); x++)
        {
            for(int y=phCuadrante; y<=(phCuadrante+2); y++)
            {
                if(tabla[x][y]==0)
                {
                    libre=posicionLibre(x, y, valor);
                    if(libre==true)
                    {
                        tabla[x][y]=valor;
                        y=phCuadrante+3;
                        x=pvCuadrante+3;
                    }
                }
            }
        }
        if(libre==false)
        {
            moverElemento(valor);
        }
    }
    private void moverElemento(int v)
    {
        int w=0;
        int z=0;
        for(int x=pvCuadrante; x<=(pvCuadrante+2); x++)
        {
            for(int y=phCuadrante; y<=(phCuadrante+2); y++)
            {
                if(tabla[x][y]==0)
                {
                    w=x;
                    z=y;
                    tabla[x][y]=v;
                    y=phCuadrante+3;
                    x=pvCuadrante+3;
                }
            }
        }
        for(int x=0; x<limite; x++)
        {
            if(tabla[w][x]==v && z!=x)
            {
                tabla[w][x]=-1;
                for(int a=0; a<limite; a++)
                {
                    if(tabla[w][a]==0)
                    {
                        tabla[w][a]=-1;
                    }
                }
                agregarElemento(obtenerCuadrante(w, x), v);
                tabla[w][x]=0;
                for(int a=0; a<limite; a++)
                {
                    if(tabla[w][a]==-1)
                    {
                        tabla[w][a]=0;
                    }
                }
            }
            if(tabla[x][z]==v && w!=x)
            {
                tabla[x][z]=-1;
                for(int a=0; a<limite; a++)
                {
                    if(tabla[a][z]==0)
                    {
                        tabla[a][z]=-1;
                    }
                }
                agregarElemento(obtenerCuadrante(x, z), v);
                tabla[x][z]=0;
                for(int a=0; a<limite; a++)
                {
                    if(tabla[a][z]==-1)
                    {
                        tabla[a][z]=0;
                    }
                }
            }
        }
    }
    private boolean posicionLibre(int pv, int ph, int v)
    {
        for(int x=0; x<limite; x++)
        {
            if(tabla[pv][x]==v)
            {
                return false;

            }
            if(tabla[x][ph]==v)
            {
                return false;
            }
        }
        return true;
    }
    private void generarTablaLista()
    {
        for(int x=0; x<limite; x++)
        {
            for(int y=0; y<limite; y++)
            {
                tablaLista[x][y]=0;
            }
        }
        int x=1;
        while(x<=dificultad)
        {
            int temp1=(int)(Math.random()*100);
            temp1=temp1%9;
            int temp2=(int)(Math.random()*100);
            temp2=temp2%9;
            if(tablaLista[temp1][temp2]==0)
            {
                tablaLista[temp1][temp2]=tabla[temp1][temp2];
                ++x;
            }
        }
    }
    public void copiarTabla()
    {
        for(int x=0; x<limite; x++)
        {
            for(int y=0; y<limite; y++)
            {
                tablaLista[x][y]=tabla[x][y];
            }
        }
    }
    public static void cambiandoDificultad(int a)
    {
        dificultad=a;
    }
    public static void cambiandoAleatoriedad(String a)
    {
        aleatoriedad=a;
    }
}