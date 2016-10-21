
public class Horse
	{

		String name;
		String breed;
		String discipline;
		int age;
		int price;
		double hands;
		String events;
		int points;
		
		
		public Horse(String n, String b, String d, int a, int p, double h, String e, int po)
			{
				
			name = n;
			breed = b; 
			discipline = d;
			age = a;
			price = p;
			hands = h;
			events = e;
			points = po; 
			
			}


		public String getName()
			{
				return name;
			}


		public void setName(String name)
			{
				this.name = name;
			}


		public String getBreed()
			{
				return breed;
			}


		public void setBreed(String breed)
			{
				this.breed = breed;
			}


		public String getDiscipline()
			{
				return discipline;
			}


		public void setDiscipline(String discipline)
			{
				this.discipline = discipline;
			}


		public int getAge()
			{
				return age;
			}


		public void setAge(int age)
			{
				this.age = age;
			}


		public int getPrice()
			{
				return price;
			}


		public void setPrice(int price)
			{
				this.price = price;
			}


		public double getHands()
			{
				return hands;
			}


		public void setHands(double hands)
			{
				this.hands = hands;
			}


		public String getEvents()
			{
				return events;
			}


		public void setEvents(String events)
			{
				this.events = events;
			}


		public int getPoints()
			{
				return points;
			}


		public void setPoints(int points)
			{
				this.points = points;
			}

		
	}