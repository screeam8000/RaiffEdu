package deliveryclubtest.checkers;

import deliveryclubtest.IMenuChecker;
import deliveryclubtest.data.MenuChoiceTestPair;
import deliveryclubtest.pages.DeliveryClubMainPageObject;

import java.util.ArrayList;
import java.util.List;

public class MenuTestPairChecker implements IMenuChecker {
    private List<String> wrongList = new ArrayList<String>();

    private DeliveryClubMainPageObject page;
    private MenuChoiceTestPair pair;

    public MenuTestPairChecker(DeliveryClubMainPageObject page,
                               MenuChoiceTestPair pair) {
        this.page = page;
        this.pair = pair;
    }

    @Override
    public boolean check() {
        boolean result = true;

        if(!pair.getMenuChoiseTitle().equals(page.getTitle())){
            result = false;
            wrongList.add("WRONG TITLE");
        }

        if(!page.getCheckBoxNyName(pair.getCheckedBoxName()).isChecked()){
            result = false;
            wrongList.add("CHECKBOX UNCHECKED");
        }

        return result;
    }

    public List<String> getWrongList() {
        return wrongList;
    }
}

