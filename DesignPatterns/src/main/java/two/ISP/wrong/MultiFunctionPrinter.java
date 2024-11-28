package two.ISP.wrong;

import two.ISP.Document;

public class MultiFunctionPrinter implements Machine {
    @Override
    public void fax(Document d) {

    }

    @Override
    public void print(Document d) {

    }

    @Override
    public void scan(Document d) {

    }
}
