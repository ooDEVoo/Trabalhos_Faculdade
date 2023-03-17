package Universidades;



public class MEC {

	public void ImprimeUniversidades(Universidade[] array)
    {
        for (int i = 0; i < array.length; i++){
            if(array[i] instanceof Privada)
                array[i].imprimeInfo();
            else if(array[i] instanceof Publica)
                //downcasting
                ((Publica)array[i]).imprimeInfo();
            else if(array[i] instanceof Universidade)
                array[i].imprimeInfo();
        }
    }


	public void maisCara(Universidade[] array){
        double maiscara = 0;
        Privada pv = null;
        for (int i = 0; i < array.length; i++){
            if(array[i] instanceof Privada){
                   //downcasting
                if(((Privada)array[i]).getValorMensalidade() > maiscara){
                	maiscara = ((Privada)array[i]).getValorMensalidade();
                    pv = (Privada)array[i];
                }
            } 
        }
        
        System.out.println("-- \nUniversidade Privada mais cara --");
        if(pv != null) {
        pv.imprimeInfo();
        }
	}   
  

	public void universidadesDoSul(Universidade[] array){
     
			System.out.println(" \n---- Universidades do Sul ----- ");
			
		int flagLocalizou = 0;
        for(int i = 0; i < array.length; i++){
           if(array[i] instanceof Publica){
               if(((Publica)array[i]).getEstado().equalsIgnoreCase("SC"))
                   array[i].imprimeInfo();
                   else if(((Publica)array[i]).getEstado().equalsIgnoreCase("RS" ))
                   array[i].imprimeInfo();    
                   else if(((Publica)array[i]).getEstado().equalsIgnoreCase("PR"))
                   array[i].imprimeInfo();   
                   
                   else {
                	   
               }
           }   
           flagLocalizou = 1;
             
           if(flagLocalizou == 0){
           System.out.println("Área de Atuação Não possui Professores!");
        }
        }   
  
    }
	
}
	

	

