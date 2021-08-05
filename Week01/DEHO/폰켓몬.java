import java.util.*;

class Solution {

    public int solution(int[] nums) {

        Set<Integer> set = new HashSet<>();
        for(int i = 0 ; i < nums.length ; i++){
            set.add(nums[i]);
        }
        return ( (set.size() > (nums.length / 2 ) )? (nums.length / 2 ): set.size() );
    }
}

// 최대 n/2마리 선택할 수 있고, 최대한 많은 종류의 포켓몬을 원한다면,
// 종류별로 한마리씩 고른게 set의 사이즈이고, 몬스터 종류가 배열의 절반크기보다 작다면 셋의 사이즈>가 가장 많은 다양한 동물들을 리턴한다
