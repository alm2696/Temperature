public class Temperature {

		private double temperature;
		private char scale;

		public Temperature()
		{
			temperature = 0;
			scale = 'C';
		}

		public Temperature(char scale)
		{
			this.scale = scale;
			temperature = 0;
		}
		
		public Temperature(double temperature)
		{
			this.temperature = temperature;
			scale = 'C';
		}

		public Temperature(double temperature, char scale)
		{
			this.temperature = temperature;
			this.scale = scale;
		}
		
		public double getCelsius()
		{
			if (scale == 'C')
			{
				return temperature;
			}
			else
			{
				return ((double) (Math.round((5 * (temperature - 32.0) / 9.0) * 10.0)) / 10);
			}
		}

		public double getFahrenheit()
		{
			if (scale == 'F')
			{
				return temperature;
			}
			else
			{
				return (Math.round((9 * (temperature / 5) + 32) * 10) / 10);
			}
		}

		public void setTemperature(double temperature)
		{
			this.temperature = temperature;
		}
		
		public void setScale(char scale)
		{
			this.scale = scale;
		}
		
		public void setTemperatureScale(double temperature, char scale)
		{
			this.temperature = temperature;
			this.scale = scale;
		}

		public boolean equals(Object obj)
		{
			if (obj instanceof Temperature)
			{
				Temperature t = (Temperature) obj;
				return getCelsius() == t.getCelsius();
			}
			return false;
		}
		
		public boolean lessthan(Object obj)
		{
			if (obj instanceof Temperature)
			{
				Temperature t = (Temperature) obj;
				return getCelsius() > t.getCelsius();
			}
			return false;
		}
		
		public boolean greaterthan(Object obj)
		{
			if (obj instanceof Temperature)
			{
				Temperature t = (Temperature) obj;
				return getCelsius() < t.getCelsius();
			}
			return false;
		}
		
		public String toString()
		{
			if (scale == 'C')
			{
				return String.format("%.1f degrees C = %.1f degrees F", temperature, getFahrenheit());
			}
			else
			{
				return String.format("%.1f degrees F = %.1f degrees C", temperature, getCelsius());
			}
		}
	}