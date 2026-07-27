import chapter2.singleton.Elvis;
import chapter2.singleton.ElvisEnum;

void main() {
  Elvis el = Elvis.INSTANCE;
  el.leaveTheBuilding();
  ElvisEnum elNum = ElvisEnum.INSTANCE;
  elNum.leaveTheBuilding();
}