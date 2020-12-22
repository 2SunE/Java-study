### 컬렉션 프레임워크 📝

<h4>List 컬렉션</h4>
<ul>
	<li>배열과 비슷하게 객체를 인덱스로 관리한다.
		<ul>
			<li>배열과의 차이점은 저장용량이 자동으로 증가하며, 객체를 저장할 때 자동 인덱스가 부여된다.</li>
			<li>추가, 삭제, 검색을 위한 다양한 메소드들이 제공된다.</li>
		</ul>
	</li>
	<li>List 컬렉션은 객체 자체를 저장하는 것이 아니라 객체의 번지를 참조한다
		<ul>
			<li>동일한 객체를 중복 저장할 수 있는데, 이 경우 동일한 번지가 참조된다.</li>
			<li>null도 저장이 가능하며, 이 경우 해당 인덱스는 객체를 참조하지 않는다.</li>
		</ul>
	</li>
	<li>ArrayList
		<ul>
			<li>기본 생성자로 ArrayList 객체를 생성하면 내부에 10개의 객체를 저장할 수 있는 초기 용량을 가진다.</li>
			<li>저장되는 객체 수가 늘어나면 용량이 자동으로 증가한다.</li>
			<li>특정 인덱스의 객체를 제거하면 바로 뒤 인덱스부터 마지막 인덱스까지 모두 앞으로 1씩 당겨진다.</li>
			<li>마찬가지로 특정 인덱스에 객체를 삽입하면 해당 인덱스부터 마지막 인덱스까지 모두 1씩 밀려난다.
				<ul>
					<li>이런 동작 때문에 저장된 객체 수가 많고, 특정 인덱스에 객체를 추가하거나 제거하는 일이 빈번하다면 <br>
						ArrayList보다는 LinkedList를 사용하는 것이 좋다.	
					</li>
					<li>
						인덱스를 이용해서 객체를 찾거나 맨 마지막에 객체를 추가하는 경우에는 ArrayList가 더 좋은 성능을 발휘한다.
					</li>
				</ul>
			</li>
		</ul>
	</li>
	<li>Vector
		<ul>
			<li>Vector는 ArrayList와 동일한 내부 구조를 가지고 있다.</li>
			<li>ArrayList와 다른 점은 동기화된(synchronized) 메소드로 구성되어 있다.
				<ul>
					<li>멀티 스레드가 동시에 Vector의 메소드를 실행할 수 없고, 하나의 스레드가 메소드 실행을 완료해야만<br>
						다른 스레드가 메소드를 실행할 수 있다.
					</li>
					<li>
						그래서 멀티 스레드 환경에서 안전하게 객체를 추가, 삭제할 수 있다. (thread safe)
					</li>
				</ul>
			</li>
		</ul>
	</li>
	<li>LinkedList
		<ul>
			<li>List 구현 클래스이므로 ArrayList와 사용 방법은 똑같은데, 내부 구조는 완전 다르다.</li>
			<li>ArrayList는 내부 배열에 객체를 저장해서 관리하지만, LinkedList는 인접 참조를 링크해서 체인처럼 관리한다.
				<ul>
					<li>특정 인덱스의 객체를 제거하면 앞뒤 링크만 변경되고 나머지 링크는 변경되지 않는다.</li>
					<li>특정 인덱스에 객체를 삽입할 때에에도 마찬가지다.</li>
				</ul>
			</li>
			<li>끝에서부터(순차적) 추가 또는 삭제하는 경우는 ArrayList가 빠르지만,<br>
				중간에 추가, 삭제하는 경우는 앞뒤 링크 정보만 변경하는 LinkedList가 더 빠르다.
				<ul>
					<li>ArrayList는 뒤쪽 인덱스들을 모두 1씩 증가 또는 감소시키는 시간이 필요하므로 처리 속도가 느리다.</li>
				</ul>
			</li>
			<li>LinkedList가 처음 생성될 때에는 어떠한 링크도 만들어지지 않기 때문에 내부는 비어 있다고 보면 된다.</li>
		</ul>
	</li>
</ul>

<h4>Set 컬렉션</h4>
<ul>
	<li>List 컬렉션은 객체의 저장 순서를 유지하지만, Set 컬렉션은 저장 순서가 유지되지 않는다.</li>
	<li>객체를 중복해서 저장할 수 없고, 하나의 null만 저장할 수 있다.</li>
	<li>Set 컬렉션은 수학의 집합과 비슷하다. 집합은 순서와 상관없고 중복이 허용되지 않기 때문이다.<br>
		그리고 구슬 주머니와도 같다. 동일한 구슬을 2개 넣을 수 없고, 들어갈 때의 순서와 나올 때의 순서가 다를 수도 있기 때문이다.
	</li>
	<li>Set 컬렉션에는 HashSet, LinkedHashSet, TreeSet 등이 있다.
		<ul>
			<li>인덱스로 관리하지 않기 때문에 인덱스를 매개값으로 갖는 메소드가 없다.</li>
		</ul>
	</li>
	<li>HashSet
		<ul>
			<li>Set 인터페이스의 구현 클래스다.</li>
			<li>HashSet을 생성하기 위해서는 다음과 같이 기본 생성자를 호출하면 된다.
				<ul>
					<li>Set<E> set = new HashSet<E>();</li>
				</ul>
			</li>
			<li>객체들을 순서 없이 저장하고 동일한 객체는 중복 저장하지 않는다.
				<ul>
					<li>HashSet은 객체를 저장하기 전에 먼저 객체의 hashCode() 메소드를 호출해서 해시코드를 얻어내고, <br>
						이미 저장되어 있는 객체들의 해시코드와 비교한다.
					</li>
					<li>
						동일한 해시코드가 있다면 다시 equals() 메소드로 두 객체를 비교해서 true가 나오면 동일한 객체로 판단하고 중복 저장을 하지 않는다.
					</li>
				</ul>
			</li>
		</ul>
	</li>
</ul>

<h4>Map 컬렉션</h4>
<ul>
	<li>Map 컬렉션은 키와 값으로 구성된 Map.Entry 객체를 저장하는 구조를 가지고 있다.</li>
	<li>Entry는 Map 인터페이스 내부에 선언된 중첩 인터페이스다. 여기서 키와 값은 모두 객체다.</li>
	<li>키는 중복 저장될 수 없지만 값은 중복 저장될 수 있다. 만약에 기존에 저장된 키와 동일한 키로<br>
		값을 저장하면 기존의 값은 없어지고 새로운 값으로 대체된다.
	</li>
	<li>Map 컬렉션에는 HashMap, Hashtable, LinkedHashMap, Properties, TreeMap 등이 있다.</li>
	<li>HashMap
		<ul>
			<li>Map 인터페이스를 구현한 대표적인 Map 컬렉션이다.</li>
			<li>HashSet을 생성하기 위해서는 다음과 같이 기본 생성자를 호출하면 된다.
				<ul>
					<li>Map<K, V> map = new HashMap<K, V>();</li>
				</ul>
			</li>
			<li>HashMap의 키로 사용할 객체는 hashCode()와 equals() 메소드를 재정의해서 동등 객체가 될 조건을 정해야한다.
				<ul>
					<li>객체가 달라도 동등 객체라면 같은 키로 간주하고 중복 저장되지 않도록 하기 위함이다.</li>
					<li>동등 객체의 조건은 hashCode()의 리턴값이 같아야 하고, equals() 메소드가 true를 리턴해야 한다.</li>
				</ul>
			</li>
			<li>
				키와 값의 타입은 기본 타입(byte, short, int, float, double, boolean, char)을 사용할 수 없고 <br>
				클래스 및 인터페이스 타입만 사용 가능하다.
			</li>
		</ul>
	</li>
	<li>Hashtable
		<ul>
			<li>Hashtable은 HashMap과 동일한 내부 구조를 가지고 있다.
				<ul>
					<li>
						HashMap과의 차이점은 Hashtable은 동기화된(synchronized) 메소드로 구성되어 있기 때문에 <br>
						멀티스레드가 동시에 Hashtable의 메소드들을 실행할 수 없고, 하나의 스레드가 실행을 완료해야만 <br>
						다른 스레드를 실행할 수 있다. 그래서 멀티 스레드 환경에서 안전하게 객체를 추가, 삭제할 수 있다. (thread safe)
					</li>
				</ul>
			</li>
			<li>키로 사용할 객체는 hashCode()와 equals() 메소드를 재정의해서 동등 객체가 될 조건을 정해야한다.
					<li>Map<K, V> map = new Hashtable<K, V>();</li>
				</ul>
			</li>
		</ul>
	</li>
</ul>
