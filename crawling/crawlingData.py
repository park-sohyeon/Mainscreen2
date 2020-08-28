import json
import re
from bs4 import BeautifulSoup
from urllib.request import urlopen
from collections import OrderedDict

def find_detail_info(productDetail, detail_info):
    result = []
    for npd in productDetail:
        there_is_no_info_True = True
        for disp in npd:
            if (detail_info) in disp:
                result.append(disp)
                there_is_no_info_True = False
                break
        if there_is_no_info_True:
            result.append(detail_info + ' : 정보없음')
    
    return result


file_data = []

page = list(range(1, 10, 1))
for page_number in page:

    url = "https://search.shopping.naver.com/search/all?exrental=true&exused=true&frm=NVSHATC&origQuery=%EB%85%B8%ED%8A%B8%EB%B6%81&pagingIndex=" + str(page_number) + "&pagingSize=40&productSet=total&query=%EB%85%B8%ED%8A%B8%EB%B6%81&sort=rel&timestamp=&viewType=list"
    html = urlopen(url)
    bsObject = BeautifulSoup(html, "html.parser")       # html 파일

    PRODUCT_NAME = []
    PRICE = []

    for a_bo3 in bsObject.find_all('div', 'basicList_title__3P9Q7'):
        for b in a_bo3.find_all('a', 'basicList_link__1MaTN'):
            PRODUCT_NAME.append(re.sub('<.+?>', '',str(b),0).strip())       # 제품명 수집

    for a_bo3 in bsObject.find_all('span', 'price_num__2WUXn'):
        for b in a_bo3:
            PRICE.append(re.sub('<.+?>', '',str(b),0).strip())      # 제품 가격 수집

    needProductDetail = []                              # 제품의 디테일한 정보를 담는 리스트
    for product_detail in bsObject.find_all('div', 'basicList_detail_box__3ta3h'):
        product_detail_info = []
        try:
            for product_info in product_detail:
                product_detail_info.append(product_info.get_text())
            needProductDetail.append(product_detail_info)
        except:
            needProductDetail.append(product_detail_info)
            continue


    DISPLAY = find_detail_info(needProductDetail, '화면크기') # 제품의 디테일한 정보에서 화면크기 정보 수집
    CPU_NAME = find_detail_info(needProductDetail, 'CPU :')   # 제품의 디테일한 정보 CPU 정보 수집
    RESOLUTION = find_detail_info(needProductDetail, '해상도')  # 제품의 디테일한 정보 해상도 정보 수집
    RAM = find_detail_info(needProductDetail, '램')             # 제품의 디테일한 정보 램 정보 수집
    STORAGE_SIZE = find_detail_info(needProductDetail, 'SSD')   # 제품의 디테일한 정보 SSD 정보 수집
    WEIGHT = find_detail_info(needProductDetail, '무게')        # 제품의 디테일한 정보 무게 정보 수집

    matrix = [PRODUCT_NAME, PRICE, DISPLAY, CPU_NAME, RESOLUTION, RAM, STORAGE_SIZE, WEIGHT]
    for m in list(zip(*matrix)):
        file_data.append(m)

file_data = list(set(file_data))            # 중복 제거

            
    
print(json.dumps(file_data, ensure_ascii = False, indent = "\t"))
