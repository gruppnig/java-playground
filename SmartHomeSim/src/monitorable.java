
public interface monitorable {
	float getCurrentValue(); // get current Value of given sensor reading (more than one per sensor possible)
	int getStatus(); // 0->Off, 1->On, -1->Undefined/Error
}
