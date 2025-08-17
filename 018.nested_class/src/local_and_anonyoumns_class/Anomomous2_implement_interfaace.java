package local_and_anonyoumns_class;

interface hello {
	public void kaisho();

	public void konho(String s);
}
/// esme anunomyomous class basically interface ko implement karne me help kaar rahi hai
class Anomomous2_implement_interfaace {
	public static void main(String... sujal) {
		hello bro = new hello() {
			@Override
			public void kaisho() {
				System.out.println("badiya hu");
			}

			@Override
			public void konho(String s) {
				System.out.println("badiya hu mera name " + s + "hai");
			}

		};
		
		
		
		
		
		bro.kaisho();
		bro.konho("raju ");
	}

}