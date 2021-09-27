def solution(enter, leave):
    answer = [0] * len(enter)

    room = []
    idx = 0
    for l in leave:
        print(l)
        while l not in room:
            room.append(enter[idx])
            idx += 1
        print(room)
        room.remove(l)
        print(room)
        for person in room:
            answer[person - 1] += 1
        answer[l - 1] += len(room)

    return answer
