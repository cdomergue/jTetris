package test.java.domergue.bastide.jTetris.components.tetriminos;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import main.java.domergue.bastide.jTetris.components.tetriminos.Tetrimino;
import main.java.domergue.bastide.jTetris.components.tetriminos.TetriminoBuilder;
import main.java.domergue.bastide.jTetris.components.tetriminos.TetriminoPieces;

public class TetriminoBuilderTest {
	
	private TetriminoBuilder tetriminoBuilder;
	
	@Before
	public void beforeTests(){
		this.tetriminoBuilder = TetriminoBuilder.getInstance();
	}
	
	@Test
	public void testTeriminoIPiece() {
		Tetrimino tetriminoI = tetriminoBuilder.build(TetriminoPieces.PIECE_I);
		
		assertEquals(true, tetriminoI.getShape().getUnits(2, 0));
		assertEquals(true, tetriminoI.getShape().getUnits(3, 0));
		assertEquals(false, tetriminoI.getShape().getUnits(2, 3));
	}

}