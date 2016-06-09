package facade;

/**
 * Created by lzh on 3/29/16.
 */
public class BaiduImp implements Baidu {
    @Override
    public void computerShutdown() {
        Computer computer = new ComputerImp();
        computer.shutdown();

    }

    @Override
    public void searchSomething() {
        Search search = new SearchImp();
        search.search();
    }
}
