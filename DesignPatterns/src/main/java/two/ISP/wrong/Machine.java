package two.ISP.wrong;

import two.ISP.Document;

public interface Machine {
    void print(Document d);
    void fax(Document d);
    void scan(Document d);
}
