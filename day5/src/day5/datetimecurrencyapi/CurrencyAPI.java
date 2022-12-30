package day5.datetimecurrencyapi;

import java.util.Currency;
import java.util.Locale;

public class CurrencyAPI {

	public static void main(String[] args) {
		/**
		 * 100,000 -- US system or Europe-- different EN,DE,ES,FR 1,00,000 --- India
		 * system - IN 
		 * A {@code Locale} object represents a specific geographical,
		 * political, or cultural region. An operation that requires a 
		 * {@code Locale} to
		 * perform its task is called <em>locale-sensitive</em> and uses the
		 * {@code Locale} to tailor information for the user.
		 */
		Currency currency = Currency.getInstance(Locale.GERMANY);
		System.out.println(currency.getCurrencyCode());
		System.out.println(currency.getSymbol());
		System.out.println(currency.getDisplayName());
		
		System.out.println(Currency.getInstance(Locale.getDefault()).getCurrencyCode());
		System.out.println(Currency.getInstance(Locale.getDefault()).getSymbol());
		System.out.println(Currency.getInstance(Locale.getDefault()).getDisplayName());
		System.out.println(Currency.getInstance(Locale.UK).getDisplayName());
		System.out.println(Currency.getInstance(Locale.UK).getCurrencyCode());
		System.out.println(Currency.getInstance(Locale.UK).getSymbol());
		
		System.out.println(Locale.getAvailableLocales());
		for(Locale locale : Locale.getAvailableLocales()) {
			System.out.println(locale);
		}
		

	}

}
