package clase;

import interfete.ICommand;
import interfete.IPersonalCuratenie;

public class StartCuratenieCommand implements ICommand{
	private IPersonalCuratenie curatenie;

    public StartCuratenieCommand(IPersonalCuratenie curatenie) {
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
