package com.AmbulanceRoute;

public class AmbulanceRoute {
	private Unit head ;
	public void addFirstUnit(String name ,boolean available) {
		Unit newUnit =new Unit(name , available);
		head =newUnit;
		head.next = head ;
	}
	public void addUnit(String name ,boolean available) {
		if(head == null) {
			addFirstUnit(name ,available);
			return;
		}
		Unit temp = head ;
		while(temp.next !=head) {
			temp = temp.next;
		}
		Unit newUnit = new Unit(name , available);
		temp.next = newUnit;
		newUnit.next =head ;
		
	}
	public Unit findAvailableUnit() {
        if (head == null) return null;

        Unit temp = head;
        do {
            if (temp.available) return temp;
            temp = temp.next;
        } while (temp != head);

        return null;
    }
	public void redirectPatient() {
        Unit unit = findAvailableUnit();
        if (unit != null) {
            System.out.println("Patient sent to: " + unit.name);
        } else {
            System.out.println("No unit available!");
        }
    }
	public void removeUnit(String unitName) {
        if (head == null) return;

        Unit curr = head;
        Unit prev = null;

        do {
            if (curr.name.equals(unitName)) {

                // single node
                if (curr.next == curr) {
                    head = null;
                    return;
                }

                // removing head
                if (curr == head) {
                    Unit last = head;
                    while (last.next != head) last = last.next;
                    last.next = head.next;
                    head = head.next;
                } else {
                    prev.next = curr.next;
                }

                System.out.println(unitName + " removed (maintenance)");
                return;
            }

            prev = curr;
            curr = curr.next;

        } while (curr != head);
    }
	public void displayUnits() {
        if (head == null) return;

        Unit temp = head;
        do {
            System.out.print(temp.name + " → ");
            temp = temp.next;
        } while (temp != head);
        System.out.println("(back to " + head.name + ")");
    }

}
	
	
	
//	Unit emergency = new Unit("emergency" , true);
//	Unit radiology = new Unit("radiology" , true);
//	Unit surgery = new Unit("surgery" , false);
//	Unit icu = new Unit("ice" , true);
//	 emergency.next = radiology ;
//	 radiology.next = surgery;
//	 surgery.next = icu;
//	 icu.next = emergency;
