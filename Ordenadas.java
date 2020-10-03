public class Ordenadas {

    public String leerTxt(String direccion) { 

        String txt = "";
        try {
           
            BufferedReader bf = new BufferedReader(new FileReader(direccion));
            String temp = ""; 

            String bfRead;
           
            while ((bfRead = bf.readLine()) != null) { 

                temp = temp + bfRead;
            }
            txt = temp; 

        } catch (IOException e) {
            
        }
        return txt;
    }




    }
