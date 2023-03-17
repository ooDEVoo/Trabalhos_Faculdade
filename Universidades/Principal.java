package Universidades;

public class Principal {

	public static void main(String[] args) {
		
		Universidade[] arrayUni;
		
        arrayUni = new Universidade[Teclado.leInt("Quantas Universidades deseja criar? ")];
        int escolha = 0;
        for(int i = 0; i < arrayUni.length; i++){
            escolha = Teclado.leInt("Que tipo de Universidade deseja criar? (1-Privada 2-Pública)\n ");
            if (escolha == 1){                            
                arrayUni[i] = new Privada(Teclado.leString("\nInforme o nome: "), 
                                           Teclado.leInt("\nQuantidade de Alunos: "), 
                                           Teclado.leInt("\nQuantidade de Professor: "), 
                                           Teclado.leDouble("\nValor da Mensalidade: ")
                                           );
            }
            else if (escolha == 2){ 
            	
                arrayUni[i] = new Publica(Teclado.leString("\nInforme o nome: "), 
                                           Teclado.leInt("\nQuantidade de Alunos: "), 
                                           Teclado.leInt("\nQuantidade de Professor: "), 
                                           Teclado.leString("\nEstado: "),
                                           Teclado.leString("\nCidade: ")
                                           );
           } 
        }   
        MEC mec = new MEC();
        mec.ImprimeUniversidades(arrayUni);
        System.out.println();
        
        
        mec.universidadesDoSul(arrayUni);
        
        
        mec.maisCara(arrayUni);
        
        //mec.universidadesDoSul(arrayUni, null);
        
        
        
}
}



