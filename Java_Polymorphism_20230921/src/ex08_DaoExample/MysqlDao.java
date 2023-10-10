package ex08_DaoExample;

public class MysqlDao implements DataAccessObject{
	@Override
	public void select() {
		System.out.println("mysql select");
	}

	@Override
	public void insert() {
		System.out.println("mysql insert");
	}

	@Override
	public void update() {
		System.out.println("mysql update");
	}

	@Override
	public void delete() {
		System.out.println("mysql delete");
	}
}
