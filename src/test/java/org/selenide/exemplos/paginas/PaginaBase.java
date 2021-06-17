package org.selenide.exemplos.paginas;

import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Selenide.executeJavaScript;

public class PaginaBase {

//	public static void preencheCampoTextoViaJavaScript(String value) {
//
//		if (key.equals("id")) {
//			executeJavaScript("document.getElementById('" + locator + "').value='" + value + "';");
//		}
//		if (key.equals("name")) {
//			executeJavaScript("document.getElementByName('" + locator + "').value='" + value + "';");
//		}
//
//		if (key.equals("querySelector")) {
//			executeJavaScript("document.querySelector('" + locator + "').value='" + value + "';");
//		}
//	}

	public static void clickBotaoViaJavaScript(SelenideElement button) {
		executeJavaScript("arguments[0].click();", button);
	}

	/*public static String removerCaracteresEspeciais(String str) {
		return Normalizer.normalize(str, Normalizer.Form.NFD)
				.replaceAll("[^\\p{ASCII}]", "").toLowerCase();
	}*/

	public static String removerCaracteresEspeciais(String text) {


		return text.replaceAll("[ãâàáä]", "a");
//				.replaceAll("[êèéë]", "e")
//				.replaceAll("[îìíï]", "i")
//				.replaceAll("[õôòóö]", "o")
//				.replaceAll("[ûúùü]", "u")
//				.replaceAll("[ÃÂÀÁÄ]", "A")
//				.replaceAll("[ÊÈÉË]", "E")
//				.replaceAll("[ÎÌÍÏ]", "I")
//				.replaceAll("[ÕÔÒÓÖ]", "O")
//				.replaceAll("[ÛÙÚÜ]", "U")
//				.replace('ç', 'c')
//				.replace('Ç', 'C')
//				.replace('ñ', 'n')
//				.replace('Ñ', 'N')
//				.replaceAll("!", "");
//				.replaceAll ("\\[\\´\\`\\?!\\@\\#\\$\\%\\¨\\*"," ");
	}
}
