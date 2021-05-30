package AgricTrader;

import java.time.LocalDate;

public class MainAgric {
	public static void main (String[] args) {
		
		//criar o objeto da classe usuario
		
		Usuario usuario1 = new Usuario(1,"pedromatos88","Pm881agri#","3198171702","300.135.871.176","Produtor de Milho");
		
		//criar o objeto da classe produto
		
		Produtos produto1 = new Produtos(2,1,"Milho Safrinha","Saca 60 kg","2021","Milho Safrinha Amarelo","ISO 14001");
		
		Produtos produto2 = new Produtos(2,1,"Feijão","Saca 80 kg","2020","Feijão Safrinha","ISO 14001");
		
		//criar objeto proposta
		
		Proposta proposta1 = new Proposta(1,2,3,4,5,LocalDate.now(),1200,LocalDate.now(),5,5);
		
		System.out.println();
		
		System.out.println(proposta1 + "cadastrada com sucesso!");
		
		System.out.println();
		
		System.out.println("O usuário1 tem como atividade: "+ usuario1.getDesc_atividade());
		
		System.out.println();
		
		System.out.println("A safra do produto " + produto1.getDesc_detalhada()+ " é: " + produto1.getSafra());
		
		System.out.println();
		
		System.out.println("A safra do produto " + produto2.getDesc_detalhada()+ " é: " + produto2.getSafra());
		
		
	}

}
