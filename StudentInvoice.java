
public class StudentInvoice {
	private String studentName, studentNumber;
	private double tuitionFees, scholarships;
	
	public StudentInvoice(String studentNameIn, String studentNumberIn,
			double tuitionFeesIn, double scholarshipsIn) {
		studentName = studentNameIn;
		studentNumber = studentNumberIn;
		tuitionFees = tuitionFeesIn;
		scholarships = scholarshipsIn;
	}
	
	public String getName() {
		return studentName;
	}
	
	public boolean setName(String studentNameIn) {
		if (studentNameIn.isEmpty() || studentNameIn.length() == 0) {
			return false;
		}
		studentName = studentNameIn.trim();
		return true;
	}
	
	public String getStudentNumber() {
		return studentNumber;
	}
	
	public boolean setStudentNumber(String studentNumberIn) {
		if (studentNumberIn.isEmpty() || studentNumberIn.length() == 0) {
			return false;
		}
		studentNumberIn = studentNumberIn.trim();
		return true;
	}
	
	public double getTuitionFees() {
		return tuitionFees;
	}
	
	public boolean setTuitionFees(double tuitionFeesIn) {
		if (tuitionFeesIn >= 0) {
			tuitionFeesIn = tuitionFees;
			return true;
		}
		return false;
	}
	
	public double getScholarships() {
		return scholarships;
	}
	
	public boolean setScholarships(double scholarshipsIn) {
		if (scholarshipsIn >= 0) {
			scholarshipsIn = scholarships;
			return true;
		}
		return false;
	}
	
	public double adjustTuitionFees(double tuitionFeesIn) {
		double result = tuitionFees + tuitionFeesIn;
		if (result >= 0) {
			tuitionFees = result;
		}
		return tuitionFees;
	}
	
	public double adjustScholarships(double scholarshipsIn) {
		double result = scholarships + scholarshipsIn;
		if (result >= 0) {
			scholarships = result;
		}
		return scholarships;
	}
	
	public String toString() {
		String output = "Name: " + getName()
		+ "\nID Number: " + getStudentNumber()
		+ "\nTuition & Fees: $" + getTuitionFees()
		+ "\nScholarships: $" + getScholarships(); 
		
		if (tuitionFees > scholarships) {
			output += "\nYou Owe: $" + (tuitionFees-scholarships);
		} else {
			output += "\nPlease pick up your check for: $" + (scholarships-tuitionFees);
		}
		return output;
	}
	
	/*
	 * Examples
	 */
	public static void main(String[] args) {
		StudentInvoice student1 = new StudentInvoice("John Doe", "1234567890", 5000, 2000);
		StudentInvoice student2 = new StudentInvoice("Jane Doe", "0987654321", 5000, 6000);
		System.out.println(student1.toString() + "\n\n" + student2.toString());
	}
}