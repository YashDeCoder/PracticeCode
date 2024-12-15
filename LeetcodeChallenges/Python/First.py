def strStr(haystack, needle):
    """
    :type haystack: str
    :type needle: str
    :rtype: int
    """
    ret = haystack.find(needle)
    return ret
needle = "pensi"
haystack = "sadPenis"
rotate_result = strStr(haystack,needle)
print(rotate_result)