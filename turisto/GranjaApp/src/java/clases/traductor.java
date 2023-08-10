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
    public static String ubicacion;
    public static String Traducir()
    {
        switch(palabra)
        {
            case "Tingos":
                title = "Tingos";
               descripcion = "Tingos es un restaurante de carnes muy calificado por sus comensales que tambien presta servicios de eventos donde puedes encontrar una amplia variedad de platillos";
               imagen = "Tingos restaurante.jpg";
               ubicacion = "https://www.google.com/maps/embed?pb=!1m18!1m12!1m3!1d3877.512482509295!2d-87.8902850851709!3d13.626560490428675!2m3!1f0!2f0!3f0!3m2!1i1024!2i768!4f13.1!3m3!1m2!1s0x8f6535d62278f435%3A0x338ffce948618695!2sTingo&#39;s%20Roasted%20%26%20BBQ!5e0!3m2!1ses-419!2ssv!4v1686672028730!5m2!1ses-419!2ssv\" width=\"600\" height=\"450\" style=\"border:0;\" allowfullscreen=\"\" loading=\"lazy\" referrerpolicy=\"no-referrer-when-downgrade";
                break;
            case "Litos":
                 title = "Litos";
                descripcion = "Litos es un restaurante de comida mexicana muy valorado por sus clientes que ademas tiene varias sucursales en diferentes lugares del pais  lo cual una de ellas es la que se encuentra aqui en Santa Rosa de Lima.";
                imagen = "litos restaurante.jpg";
                ubicacion="https://www.google.com/maps/embed?pb=!1m18!1m12!1m3!1d3877.550973368345!2d-87.89577988517095!3d13.624214090430089!2m3!1f0!2f0!3f0!3m2!1i1024!2i768!4f13.1!3m3!1m2!1s0x8f65356d6aef60c3%3A0xc87e42815dec74d9!2sLito&#39;s%20Comida%20Mexicana!5e0!3m2!1ses-419!2ssv!4v1686672184342!5m2!1ses-419!2ssv\" width=\"600\" height=\"450\" style=\"border:0;\" allowfullscreen=\"\" loading=\"lazy\" referrerpolicy=\"no-referrer-when-downgrade";
                break;
            case "Pizza Hut":
                 title = "Pizza Hut";
                descripcion = "La pizza hut es uno de los lugares favoritos de parte de Santa Rosa de Lima, en donde la mayoría decide comprar la pizza, La pizza hut es conocida por su menú de cocina italoestadounidense, que incluye pizza, palitroques, bebidas y postres.";
                imagen = "Pizza Hut.jpg";
                ubicacion="https://www.google.com/maps/embed?pb=!1m18!1m12!1m3!1d3877.493377381924!2d-87.89549048517091!3d13.627724990427819!2m3!1f0!2f0!3f0!3m2!1i1024!2i768!4f13.1!3m3!1m2!1s0x8f65367ff5b0c633%3A0xcad237c3b61fe124!2sPizza%20Hut!5e0!3m2!1ses-419!2ssv!4v1686672442714!5m2!1ses-419!2ssv\" width=\"600\" height=\"450\" style=\"border:0;\" allowfullscreen=\"\" loading=\"lazy\" referrerpolicy=\"no-referrer-when-downgrade";
                break;
            case "Sol Azteca":
                 title = "Sol Azteca";
                descripcion = "El Sol Azteca es un restaurante de comida mexicana, con un buen servicio de atención de cliente, El Restaurante cuenta con una variedad de comida mexicana. ";
                imagen = "Sol Azteca.jpg";
                ubicacion="https://www.google.com/maps/embed?pb=!1m18!1m12!1m3!1d3877.476771272494!2d-87.89323968517087!3d13.6287370904272!2m3!1f0!2f0!3f0!3m2!1i1024!2i768!4f13.1!3m3!1m2!1s0x8f65367f6ce6979d%3A0xd30bb926f1a974b4!2sRestaurante%20Sol%20Azteca!5e0!3m2!1ses-419!2ssv!4v1686672503177!5m2!1ses-419!2ssv\" width=\"600\" height=\"450\" style=\"border:0;\" allowfullscreen=\"\" loading=\"lazy\" referrerpolicy=\"no-referrer-when-downgrade";
                break;
            case "Pasteleria Lorena":
                 title = "Pasteleria Lorena";
                descripcion = "La pastelería Lorena es un lugar excelente para hacer tus compras de pasteles y comprar postres también. La pastelería Lorena también es una panadería en donde puedes comprar variedades de pan.";
                imagen = "Pasteleria Lorena.jpg";
                ubicacion="https://www.google.com/maps/embed?pb=!1m18!1m12!1m3!1d3877.5145889791856!2d-87.89438818517091!3d13.626432090428654!2m3!1f0!2f0!3f0!3m2!1i1024!2i768!4f13.1!3m3!1m2!1s0x8f6535d577df37ab%3A0x506ab4102e0bca52!2sPasteler%C3%ADa%20Lorena%20%E2%80%A2%20Santa%20Rosa%20de%20Lima%20Centro!5e0!3m2!1ses-419!2ssv!4v1686672263459!5m2!1ses-419!2ssv\" width=\"600\" height=\"450\" style=\"border:0;\" allowfullscreen=\"\" loading=\"lazy\" referrerpolicy=\"no-referrer-when-downgrade";
                break;
        }
        return descripcion;
        
    }
}
