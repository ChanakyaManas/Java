package com.chessengineboard;

import java.util.HashMap;
import java.util.Map;

import javax.management.ImmutableDescriptor;

import com.chessenginepieces.Piece;

public abstract class Tiles {

	protected final int Tilecordinator;
private static final Map<Integer,EmptyTile>Empty_Tiles=createallpossibleEmptyTiles();
	public Tiles(int tilecordinator) {
		Tilecordinator = tilecordinator;
	}
	private static Map<Integer, EmptyTile> createallpossibleEmptyTiles() {
 final Map<Integer, EmptyTile>emptytileMap=new HashMap<>();
 for(int i=0;i<64;i++) {
	 emptytileMap.putIfAbsent(i, new EmptyTile(i));
	 }	
		return ImmutableMap.copyof(emptytileMap);
	}
	public abstract boolean Istitleoccupied();
	public abstract Piece getPiece();

public static final class EmptyTile extends Tiles{

	public EmptyTile(int cordinator) {
		super(cordinator);
		// TODO Auto-generated constructor stub
	}
	@Override
	public boolean Istitleoccupied() {
		return false;
	}
	@Override
	public Piece getPiece() {
		// TODO Auto-generated method stub
		return null;
	}
	public static final class Occupied extends Tiles{
private final Piece Pieceontile;
		public Occupied(int cordinator,Piece Pieceontile) {
			super(cordinator);
			this.Pieceontile=Pieceontile;
			// TODO Auto-generated constructor stub
		}

		@Override
		public boolean Istitleoccupied() {
			// TODO Auto-generated method stub
			return true;
		}

		@Override
		public Piece getPiece() {
			// TODO Auto-generated method stub
			return this.Pieceontile;
		}
		
	}
	
	
}
}
