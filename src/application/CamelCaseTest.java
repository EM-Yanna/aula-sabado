package application;

import static org.junit.jupiter.api.Assertions.assertLinesMatch;
import static org.junit.jupiter.api.Assertions.assertNotNull;

import java.util.ArrayList;
import java.util.List;

import org.junit.experimental.theories.suppliers.TestedOn;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class CamelCaseTest {
	private List<String> listacamelCase;
	
	@BeforeEach
	void initialize() {
		listacamelCase = new ArrayList<>();
		
		
	}
	@Test
	void converterCamelCaseTesteNaoNulo() {
		
		listacamelCase.add("nome");
		assertLinesMatch(listacamelCase, CamelCase.converterCamelCase("nome"));
	}
	@Test
	void converterCamelCaseTesteStringNome() {
		listacamelCase.removeAll(listacamelCase);
		listacamelCase.add("nome");
		assertLinesMatch(listacamelCase, CamelCase.converterCamelCase("nome"));
	
	}
	@Test
	void converterCamelCasetesteNomePrimeiraLetraMaiuscula(){
		listacamelCase.removeAll(listacamelCase);
		listacamelCase.add("nome");
		assertLinesMatch(listacamelCase, CamelCase.converterCamelCase("Nome"));
		
	}
	@Test
	void converterCamelCaseNomeComposto(){
		listacamelCase.removeAll(listacamelCase);
		listacamelCase.add("nome");
		listacamelCase.add("composto");
		assertLinesMatch(listacamelCase, CamelCase.converterCamelCase("nomeComposto"));
		
	}
}
