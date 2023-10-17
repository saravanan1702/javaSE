package regex.from.udemy;

public class StudentChallange1 {
    public static void main(String[] args) {
        //fint the email id is on gmail
        //find the user name and domain name from email
        //String str="saravananarumugam250.@gmail.com"//
                      //user_name           //domainName

//        String str="saravanan@gamil.com";// suppost it hotmail it will give false
/*        String str="saravanan@gmail.com";// suppost it hotmail it will give false
        int i=str.indexOf("@");
        String user_name=str.substring(0,i);
        System.out.println( "UserName"+user_name);
        String domain_name=str.substring(i+1,str.length());
        System.out.println("DomainName :"+domain_name);

        System.out.println(domain_name.startsWith("gmail"));
        int j=domain_name.indexOf(".");
        String name=domain_name.substring(0,j);
        System.out.println(name.equals("gmail"));*/
        String str="jasmine@gmail.com";
        int i=str.indexOf("@");
        String userName=str.substring(0,i);// oth index to ith index untill @not at
        String domainName=str.substring(i+1,str.length());//again startwith i+1 mean next values of @ start with end of the string
        System.out.println("UserName :"+userName);
        System.out.println("DomainName :"+domainName);
        //the email is cheking is gmail or not
        System.out.println(domainName.startsWith("gmail"));
        int j=domainName.indexOf(".");
        String name=domainName.substring(0,j);
        System.out.println(name.equals("gmail"));

    }
}
