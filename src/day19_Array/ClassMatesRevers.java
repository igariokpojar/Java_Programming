package day19_Array;

public class ClassMatesRevers {

    public static void main(String[] args) {

        String[] classMates = new String []{"Igor Pojar", "Alexandru Pojar", "Alla Cib", "Maria Pojar", "Ion pojar", "Anna Pojar"};

        for (int i = 0; i < classMates.length; i++) {

        for (int j = classMates[i].length() - 1; j >= 0; j--) {
            System.out.print(classMates[i].charAt(j));
        }
            System.out.println();

        }

    }


    }

/*
create string array, and store the names of your  class mates (10)
            reverse each students names and print them in separate lines
            	ex:
            		arr = {java, python, c#}

        		output:
        			avaJ
        			nohtyp
        			#c
 */