package game;

public enum Type {

	SCISSOR {
		@Override
		public boolean beats(Type other) {
			return (other == PAPER);
		}
	},
	PAPER {
		@Override
		public boolean beats(Type other) {
			return (other == ROCK);
		}
	},
	ROCK {
		@Override
		public boolean beats(Type other) {
			return (other == SCISSOR);
		}
	};

	public abstract boolean beats(Type other);
}
