package com.resumescreeningsystem;

 class Resume<T extends JobRole> {
	private T role ;
	public Resume(T role) {
		this.role =role;
		
	}
	public void processResume(){
		System.out.print("Processing resume "+ role.getRoleName());
	}
}

 