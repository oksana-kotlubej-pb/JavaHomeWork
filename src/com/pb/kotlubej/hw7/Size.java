package com.pb.kotlubej.hw7;
public enum Size
{
    XXS("XXS"),
    XS("XS"),
    S("S"),
    M("M"),
    L("L");
   //private String description;
   //private String euroSize;
    private String size;

    Size(final String size) {
        this.size = size;
    }
    public String getSize () {
        return size;
    }

    public void getDescription(Size size) {
        if (size==XXS)
        {
            System.out.println("Детский размер");
        }
        else
        {
            System.out.println("Взрослый размер");
        }
    }
    public void getEuroSize (Size size) {
        switch (size)
        {
            case XXS: System.out.println(32); break;
            case XS: System.out.println(34); break;
            case S: System.out.println(36); break;
            case M: System.out.println(38); break;
            case L: System.out.println(40); break;
        }
    }

}



