package sec03.lec16_exercise;

//You are asked to implement the Builder design pattern for rendering simple chunks of code.
//
//Sample use of the builder you are asked to create:
//
//CodeBuilder cb = new CodeBuilder("Person").addField("name", "String").addField("age", "int");
//System.out.println(cb);
//The expected output of the above code is:
//
//public class Person
//{
//    public String name;
//    public int age;
//}
//Please observe the same placement of curly braces and use two-space indentation.

class CodeBuilder
{
    private String className;
    private String fieldName;
    private String fieldType;

    public CodeBuilder(String className)
    {
        this.className = className;
    }

    public CodeBuilder addField(String name, String type)
    {
        fieldName = name;
        fieldType = type;
        return this;
    }

    @Override
    public String toString()
    {
        StringBuilder sb = new StringBuilder();
        sb.append("public class %s\n{\n");
//        for (Cod)

        return "public class " +
                className +
                "\n" +
                "{\n" +
                "public " + fieldType + " " + fieldName +
                ";\n" +
                "public " + fieldType + " " + fieldName +
                ";\n" +
                "}";

    }
}

class Demo {
    public static void main(String[] args) {
        CodeBuilder cb = new CodeBuilder("Person")
                .addField("name", "String")
                .addField("age", "int");
        System.out.println(cb);
    }
}