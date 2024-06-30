class Program{
			public static void main(String [] args){
				StringBuilder s =new StringBuilder("Java");
				s.append(" SE 8");
				System.out.print(s.length() + " ");
				System.out.print(s.capacity());
			}
		}