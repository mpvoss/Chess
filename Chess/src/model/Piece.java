package model;

/**
 * The Piece class holds information about a chess piece
 * @author Matthew
 *
 */
public class Piece {

	String type;
	boolean isWhite;
	boolean hasMoved;
	int row;
	int col;
	
	/**
	 * Constructor
	 * @param typeIn
	 * @param isWhiteIn
	 * @param hasMovedIn
	 */
	public Piece(String typeIn, boolean isWhiteIn, boolean hasMovedIn, int rowIn, int colIn){
		this.type = typeIn;
		this.isWhite = isWhiteIn;
		this.hasMoved = hasMovedIn;
		this.row = rowIn;
		this.col = colIn;
		
	}
	/**
	 * Copy constructor
	 * @param otherPiece
	 */
	public Piece(Piece otherPiece){
		this.type = otherPiece.getType();
		this.isWhite = otherPiece.isWhite();
		this.hasMoved=otherPiece.isHasMoved();
		this.row=otherPiece.getRow();
		this.col=otherPiece.getCol();
	}

	@Override
	public String toString() {
		String str = "";
		if (isWhite)
			str = "white ";
		else
			str = "black ";
		
		return str += type;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public boolean isWhite() {
		return isWhite;
	}

	public void setWhite(boolean isWhite) {
		this.isWhite = isWhite;
	}

	public boolean isHasMoved() {
		return hasMoved;
	}

	public void setHasMoved(boolean hasMoved) {
		this.hasMoved = hasMoved;
	}

	public int getRow() {
		return row;
	}

	public void setRow(int row) {
		this.row = row;
	}

	public int getCol() {
		return col;
	}

	public void setCol(int col) {
		this.col = col;
	}
	
}
