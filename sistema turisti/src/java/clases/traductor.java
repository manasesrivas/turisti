package clases;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author MINEDUCYT
 */
public class traductor {
    public static String palabra;
    public static String descripcion;
    public static String imagen;
    public static String title;
    public static String Traducir()
    {
        switch(palabra)
        {
            case "Tingos":
                title = "Tingos";
               descripcion = "Tingos es un restaurante jaosdfjiqjefaijfdo";
               imagen = "https://chilepsicologos.cl/wp-content/uploads/2021/12/Test-hombre-bajo-la-lluvia-scaled-1200x900.jpg";
                break;
            case "Litos":
                 title = "Litos";
                descripcion = "Litos es un jakdfjijefoaijdn";
                imagen = "https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcRe86-6WvjiAnRabFgnJSg0X7ZAzrdpuuH9IA&usqp=CAU";
                break;
        }
        return descripcion;
        
    }
}
