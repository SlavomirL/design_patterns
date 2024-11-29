package sec02.ISP.wrong;

import sec02.ISP.Document;

public interface Machine {
    void print(Document d);
    void fax(Document d);
    void scan(Document d);
}
