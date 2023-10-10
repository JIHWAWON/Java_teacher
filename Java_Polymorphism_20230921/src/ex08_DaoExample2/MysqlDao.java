package ex08_DaoExample2;

public class MysqlDao extends DataAccessObject{
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
