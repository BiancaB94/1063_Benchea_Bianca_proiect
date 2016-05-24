package clase;


import interfete.ICommand;
import interfete.IPersonalCuratenie;

public class StopCuratenieCommand implements ICommand{
	
	private IPersonalCuratenie curatenie;

    public StopCuratenieCommand(IPersonalCuratenie curatenie) {
        this.curatenie = curatenie;
    }

	@Override
	public void executeCuratenie() {
		// TODO Auto-generated method stub
		curatenie.incepeCuratenie();
	}

	@Override
	public void unexecuteCuratenie() {
		// TODO Auto-generated method stub
		curatenie.inceteazaCuratenie();
	}

    

}
