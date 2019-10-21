export class Employee {
    empId : number;
    empName : string;
    empAddress: string;
    
    constructor(id: number, name: string, address: string) {
        this.empId = id;
        this.empName = name;
        this.empAddress = address;
    }
}
