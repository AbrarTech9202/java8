package biPredicate;

public class BiPredicateExample {

	public static class Button {

		private boolean onOff;

		public Button(boolean onOff) {
			super();
			this.onOff = onOff;
		}

		public boolean isOnOff() {
			return onOff;
		}

		@Override
		public String toString() {
			return "Fan [onOff=" + onOff + "]";
		}

	}

	public static class Fan {

		private String run;

		public Fan(String run) {
			super();
			this.run = run;
		}

		@Override
		public String toString() {
			return "Fan [run=" + run + "]";
		}

		public String getRun() {
			return run;
		}

	}

	public static void main(String[] args) {

		Button button = new Button(true);
		Fan fan = new Fan("hello");
		 if (button instanceof Button) {
			System.out.println(button.isOnOff());
		}else {
			System.out.println("not matched");
		}

		/*
		 * if(){ sout() }else if(){ sout }else{ sout }
		 * 
		 * 
		 * 
		 */

	}

}
