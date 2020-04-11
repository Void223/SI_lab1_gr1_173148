class Student {
	String index;
	String firstName;
	String lastName;
	List<Integer> labPoints;
	//TODO constructor
	Student(String index, String firstName, String lastName, List<Integer> labPoints){
		this.index = index;
		this.firstName = firstName;
		this.lastName = lastName;
		this.labPoints = labPoints;
	}

	//TODO seters & getters
	public String getIndex() {
		return index;
	}

	public String getFirstName() {
		return firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public List<Integer> getLabPoints() {
		return labPoints;
	}

	public void setIndex(String index) {
		this.index = index;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public void setLabPoints(List<Integer> labPoints) {
		this.labPoints = labPoints;
	}

	public double getAverage() {
		//TODO
		double sum=0;
		for(int i=0; i<this.labPoints.size(); i++){
			sum+=this.labPoints.get(i);
		}
		return sum/this.labPoints.size();
	}

	public boolean hasSignature() {
		//TODO
		return this.labPoints.size() > 8;
	}
}
